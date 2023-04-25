#ScaleConverter 상속받는 클래스
#import 패키지이름.모듈이름
import classfication.scale_converter
from classfication.scale_converter import ScaleConverter

class ConverterScale():
    def __init__(self, units_from, units_to, factor, offset):
        super().__init__(units_from, units_to, factor)
        self.offet = offset

    def convnert(self, value):
        return super().convert(value) + self.offset



con = ScaleConverter("C","F", 1.8 ,32)
print('converting 1 kB')
print(f'{con.convert(21):.2f} + {con.units_to}')

