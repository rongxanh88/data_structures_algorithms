# Enter your code here. Read input from STDIN. Print output to STDOUT
numElements = gets.to_i
numArray = []
stringArray = []
sortingArray = Array.new(100, 0)

for index in (1..numElements)
    number, word = gets.strip.split(" ")
    number = number.to_i
    
    numArray.push(number)
    if index <= (numElements / 2)
        stringArray.push("-")
    else
        stringArray.push(word)
    end
    
    sortingArray[number] += 1
end

leftIndex = 0
rightIndex = 1
while rightIndex < sortingArray.length do
    first_value = sortingArray[leftIndex]
    second_value = sortingArray[rightIndex]
    sortingArray[rightIndex] = first_value + second_value
    
    leftIndex = rightIndex
    rightIndex += 1
end
index = 0
sortedStrings = Array.new(numElements)
while index < numElements do
    slot = numArray[numElements - index - 1]
    placement = sortingArray[slot] - 1
    sortedStrings[placement] = stringArray[numElements - index - 1]
    sortingArray[slot] -= 1
    
    index += 1
end

sortedStrings.each do |word|
    print word.to_s + " "
end

=begin
sortingArray.each do |position|
    print position.to_s + " "
end
=end