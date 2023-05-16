# hangman 게임
# - 단어의 각 글자 자리에 짧은 선이 그려진다.
# - 글자 1개를 맞추면 글자가 표시되고, 추가로 계속 맞추면 글자가 표시된다
# - 틀리면 기회가 1번 줄어든다.
# - 전체 글자를 입력하여 맞추면 프로그램 바로 종료

import random

words = ['dog', 'cat', 'monkey', 'chicken', 'frog', 'horse']
lives_remaining = 10 # 남은 기회(전역 변수)
guessed_letters = ''

def pick_a_word():
    word = random.choice(words)
    return word

def get_guess():
    print_word_with_blanks(words)
    print('Lives Remaning:' + str(lives_remaining))
    guess = input("Guess a letter or whole word? ") #철자 입력
    return guess


def print_word_with_blanks(word):
    #rint("아직 구현되지 않음")
    display_word = '' #게이머가 추측한 글자가 입력될 변수
    if guessed_letters in word:
     []   if guessed_letters.find(letter) > -1
            display_word += letter
        else:
            display_word = display_word + '-'
    print(display_word)



def process_guess(guess, word):
    global lives_remaining # 전역 변수화 함 (global)
    global guessed_letters
    lives_remaining -= 1 # 기회가 1 줄어듬
    guessed_letters += guess
    return False

def play():
    word = pick_a_word()
    while True:
        guess = get_guess()
        if process_guess(guess, word):
            print("You win! Well done!")
        if lives_remaining == 0 :
            print("Your are Hang")
            print('The word' + word)
            break
play()