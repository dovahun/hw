def compressString(String input) {
    if (!input) return ""  // Если строка пустая, возвращаем пустую строку
    
    def result = new StringBuilder()
    def currentChar = input[0]
    def count = 1

    for (int i = 1; i < input.length(); i++) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar).append(count > 1 ? count : "")
            currentChar = input[i]
            count = 1
        }
    }

    // Добавляем последнюю группу символов
    result.append(currentChar).append(count > 1 ? count : "")
    return result.toString()
}

// Проверка работы функции
def testString = "AAAAABBDCAAADDDDBC"
println compressString(testString)  // Ожидаемый результат: A5B2DCA3D4B1C