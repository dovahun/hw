temp="AAAAABBDCAAADDDDBC"

index = 0
compressed = ""
len_str = len(temp)
while index != len_str:
    count = 1
    while (index < len_str-1) and (temp[index] == temp[index+1]):
        count = count + 1
        index = index + 1
    if count == 1:
        compressed += str(temp[index])
    else:
        compressed += str(temp[index]) + str(count)
    index = index + 1

print(compressed)