package declareCheckedAndUnchecked;
import java.io.IOException;

//checked exceptions — это исключения, которые должны быть либо обработаны, либо объявлены в сигнатуре метода с помощью ключевого слова throws
public class CheckedException {
    // Объявляем checked exception в сигнатуре метода
    public void readFile(String filePath) throws IOException {
        // Предположим, что тут какая-то операция, которая может выбросить IOException
        throw new IOException("Файл не найден: " + filePath);
    }

    public static void main(String[] args) {
        CheckedException exception = new CheckedException();

        try{
            exception.readFile("example.txt");
        } catch (IOException e){
            System.out.println("faut: " + e.getMessage());
        }
    }
}
/*
checked exception - Наследуются от Exception, но не от RuntimeException.
Компилятор требует либо обработать их в try-catch, либо объявить через throws.
FileNotFoundException( subclass of IOException), IOException
 */
