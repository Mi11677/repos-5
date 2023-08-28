
public class Main {
    public static void main(String[] args) {

        System.out.format("Переменная типа %s занимает  %s байт памяти (%s бит памяти), и принимает значения в диапазоне от %s до %s\n","byte",(Byte.SIZE)/8,Byte.SIZE,Byte.MIN_VALUE,Byte.MAX_VALUE );
        System.out.format("Переменная типа %s занимает %s байт памяти (%s бит памяти), и принимает значения в диапазоне от %s до %s\n","short",(Short.SIZE)/8,Short.SIZE,Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.format("Переменная типа %s занимает   %s байт памяти (%s бит памяти), и принимает значения в диапазоне от %s до %s\n", "int",(Integer.SIZE)/8,Integer.SIZE,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.format("Переменная типа %s занимает  %s байт памяти (%s бит памяти), и принимает значения в диапазоне от %s до %s\n","long",(Long.SIZE)/8,Long.SIZE,Long.MIN_VALUE,Long.MAX_VALUE);


    }
}