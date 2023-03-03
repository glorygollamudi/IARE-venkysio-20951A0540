#Recursion in python
def rev(w):
    if len(w)==0:
        return ""
    else:
        return w[-1]+rev(w[:-1])
def rev_s(s):
    word=s.split()
    r_word=[rev(i) for i in word]
    return " ".join(r_word)
s=input("Enter a Paragraph:")
print(rev_s(s))

