public class turn {
    public static void main(String[] args) {

        String str = "helloWORLD";
        String str2 = str.substring(0, 1);//获取第一个字符
        String str3 = str.substring(1);//获取除了第一个字符以外的字符

        String str4 = str2.toUpperCase();//把第一个字符转成大写

        String str5 = str3.toLowerCase();//把除了第一个字符以外的字符转成小写

        String str6 = str4.concat(str5);//字符串拼接
        System.out.println("结果是:" + str6);
    }
}