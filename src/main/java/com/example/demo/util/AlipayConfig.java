package com.example.demo.util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116662697";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCj+uk++2ssZ9Ubi1+uvZI/8J19e6LK0YHpSwYWaDbPpqtAECKdiwISBrr79hqE87plPoQHkTfrfx+IRhBo+g8AX6M/gO/EulDNnjGHsEvKcQdoVSSsyrbSyMylJPiNumQi8scvk/2f8zxebRq7hz4emQFcHoo/2Rzh9Y5lgD4hcucRboa7MvlJ/McJvQuXMTiIzIqiCSXGYRwYwP1NfkX//rpxCRH6cmc3wiJnfOBCTk2v3olVmB0ZLIhwkCLHRfzDfAi0NdCNiEa08HsM+tqD4CpCdvke86S9qQSXMHwM87y06nM9uJAyg9jo7hDXmuaoaZWnkLlDk2n+RBwPtliLAgMBAAECggEAO87FCaqrkTuht3UjBdmwoM+CsYTJgE3foxYw9zU1YJE6fpgj9+/+ZlK8Gi/NxlYa0th1UUk+6w6nko1zaMZjeFBpezzstoT5+bTL/eBoFEMbX4tGYBtjiQeh1E3itdaYtUJ1Mb45UABoMUx75o/SMVi+7TlaVSU76pIkSJL4ljv71UwOcKx9ywC1IHSKe/3qvTpsrBp/usdb9inXLWsY0N/yRy5WtweTnTKnvxx1fpq6msS6N6f1Tzz5yBPGOuRPUda6buTkNSAASLZPjEnNVDVK8jwSiZ7kOMHQ6kMYR2hFEkMFX6ZsAHVtKZ7C3+TK9vgxWTv/LA5l18ILEUciqQKBgQDSot5ehPvsYRj3Rmh02sYg8/hTV5EVmMTF+I8ZpJ63+TOCEJJR0eaMT8RQVJsBmhqhXPg2UmyxQ6lGI6kYz4ps8q5vURnMm9kLRxKbU97RAm7bHA4K8PHIV6IWJcgjxEIRCdWRGHMZ+L4XBG0UqPNgEmB7DLOeN+j05l4jpS6UHwKBgQDHS7mNybEbVKtj4UHxhMEgx5em+rXMEhMPHPkqbaIx6RkBRdJVIT/s5AEm6OhldmisqUWcYdU/0yHPFQiOy84sZL/5I1770KccEBLBwsxb82PNYfJBfufZIAQFlhxJphbzENt15JXde0qY1IPDriN2exktGLD0ckLW9ZA9M+WOFQKBgCE7mSIIkUbGOw4oiaqGKeRhGbjsg/OIWuNxSAKfunsEUmAfBTbrixhwLWUPNDWYfsMey/qmHogJSNfMII3NkOWHlIXzocJqhGAHIqRnIyyO2bawQnbvdPZK/UPJSj56ZIITryJpXR+n4zX2eM9dqKhrvdUsN9qqr5KUFh5BnYu5AoGAH5VemJvIF365kqCWJMJXIOzAmdPNj8OlhZWf3xt0wtggAFWiWZ9lVBNmI1ZxzfKP8Bz7TScr9mttRjYdHxQpXluxGLiESv/sG8RoVJCcdk4CGQBWtg54i65JNOFvJjTOGkMnpG1PWsQ5NDMplo84S4SCnuT01ihtc0eDTk+1J2kCgYEAqb0Z0U4v2IuohHlAB52+BpzGBrQ4HiYpe0Bjiw5oYEPIfQcWIBTOzpwws0LZ8XUv85xhQiLnGvBK59ST+YCCgIrTMzN5kJWbh2rR+htKizoI77Oeg4btbK2dcOdW/zBqUftqRWs3mRQ38o5l7kppacNqGHiJD2axOt45P73Jo2E=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwpBUtBBpnMCeTtn9We101YfyCeFD9kGbAN2gAnLmpBa/S5vwlmno5oJ627j2ujBtxCtSTjSVyKLE0f5M8B2q9urIEh5xszdpIQcT+xyEyzLMc0mO8Tixx4WeZ8CUDwIIw3F1j6I1eCRG4MujwVIi7zoKykprVu0DwHfIuHY4IZgKPyV9CK6iI3YjQLr4RQDnsFHHmyi8Dmo0acn48wDg4PzLurUNOkw0nc20uvBZV7J4+lRCmwneVJU61PL2LMmA1HhXCntpoaIzEaF+PCx9S8rZdrJa8SfKG6ebLPXWGqfuimM3Z/Epo1oqpaDfCEX5H8xD9VWOvbyKqkkSBG9LnwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
