import java.io.*;
public class Message {
    public String name;
    public int lenghtOfString;
// конструктор для создания новой строки
    public Message(String str){
        name=str;
    }

// метод для подсчета количества слов в строке
    public int countWords(){
      return  lenghtOfString = this.name.split(" +").length;
    }
// метод для "разворота" строки
    public String reverse(){
        int stringLength = this.name.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = this.name.charAt(i) + result;
        }
        return result;
    }

// метод для подсчета вхождения символов в строке
    public int count(char c){
        int count = 0;
        for (int i=0; i < this.name.length(); i++)
        {
            if (this.name.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }

// метод возвращает номер (номер находится после №, но после № может пробела и не быть)

    public String number(){
        int index =this.name.indexOf("№");
        String result=this.name;
        result=result.substring(index+1);
        result=result.trim();

        if(result.contains(" ")){
            result= result.substring(0, result.indexOf(" "));
        }
        return result;

    }
//возвращает серию (серия находится после слова «серия» между пробелами,
// но серии может и не быть, слово серия может различно написано, например Серия, сеРИя)
    public String seria(){
        String result=this.name.toLowerCase();
        int index=result.lastIndexOf("серия");
        result=this.name.substring(index+5);
        result=result.trim();

        if(result.contains(" ")){
            result= result.substring(0, result.indexOf(" "));
        }
        if (result.length() == 0){
            return "You have no series number";

        }
        return result;
    }


}
