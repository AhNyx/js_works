# match(), search() 객체의 메소드
# 그루핑(grouping())
# group(1) 첫번째 그룹
import re
"""
p = re.compile('[a-z]+')
m = p.match('hello')

print(m.group()) # 문자열 출력
print(m.start()) # 시작 인덱스 - 0
print(m.end()) # 끝 인덱스 - 5
print(m.span()) # 구간(시작, 끝)
"""
"""
# 이름과 전화번호를 분리해서 추출하기
#() - 소괄호가 그룹
str = "lee 010-1234-5678"
pat = re.compile('(\w+)\s{1,2}(\d+[-]\d{4}[-]\d{4})')
mat = pat.match(str)
print(mat)
print(mat.group())
print(mat.group(1))
print(mat.group(2))
"""
# 그룹핑된 문자열에 이름 붙이기
# 정규 표현식 - (?P<그룹이름>)
str = "lee 010-1234-5678"
pat2 = re.compile('(?P<name>\w+)\s{1,2}(?P<phone>\d+[-]\d{4}[-]\d{4})')
mat2 = pat2.match(str)
print('이름:', mat2.group('name'))
print('전화번호:',mat2.group('phone'))

#sub(/g<그룹이름>)
s1 = pat2.sub('\g<name>', 'park 010-3333-4444')
s2 = pat2.sub('\g<phone>', 'park 010-3333-4444')
print(s1)
print(s2)

#문자열 바꾸기
data = """
    kim 871212-1234567
    lee 770707-2345678
"""
"""
jumin = re.compile("(\d+)[-]\d+")
jumin2 = jumin.sub('\g<1>-*******', data)
print(jumin2)
"""
# 전화번호 맨 끝자리 **** (마스크 처리)
phoneNum = """
park 010-1234-5678 
han 010-2345-6789
"""
j = re.compile("(\d+[-]\d{4})[-]\d{4}")
j2 = j.sub('\g<1>-****',phoneNum)
print(j2)



