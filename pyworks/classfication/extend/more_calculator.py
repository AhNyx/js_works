from classfication.calculator2 import Calculator

class More_Calculator(Calculator):

    def pow(self):
        num = 1
        for i in range(0, self.y):
            num = num * self.x
        return num


    """
    def pow(self):
        return self.x ** self.y
    """

    def div(self):
        """
        if self.y == 0:
            return 0
        else:
            return self.x / self.y
        """
        try:
            return self.x / self.y
        except ZeroDivisionError :
            return '0으로 나눌수 없습니다'


if __name__ == "__main__":
    cal = More_Calculator(5,2)
    print(cal.add())
    print(cal.pow())
    print(cal.div())