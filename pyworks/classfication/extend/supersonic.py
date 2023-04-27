# SupersonicAirplane 클래스 생성

from classfication.airplane import Airplane

class SupersonicAirplane(Airplane):
    # 1번 - NORMAL, 2번 - SUPERSONIC

    NORMAL = 1 # 상수 설정
    SUPERSONIC = 2

    #모드 - 멤버변수
    def __init__(self):
        self.fly_mode = SupersonicAirplane.NORMAL

    def fly(self):
        if self.fly_mode == SupersonicAirplane.SUPERSONIC:
            print("초음속으로 비행합니다")
        else:
            super().fly()

sa = SupersonicAirplane()
sa.take_off()
sa.fly()
sa.fly_mode = SupersonicAirplane.SUPERSONIC
sa.fly()
sa.land()