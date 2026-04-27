package localhost.doariva.simpleapi.service;

import org.springframework.stereotype.Service;

/**
 * HelloServiceクラスは、基本的な算術演算と挨拶メッセージを提供するサービスです。
 * このクラスはSpringのサービスコンポーネントとして扱われます。
 */
@Service
public class HelloService {

    /**
     * "Hello!"という挨拶メッセージを返します。
     *
     * @return 常に"Hello!"という文字列
     */
    public String hello() {
        return "Hello!";
    }

    /**
     * 2つの整数を加算します。
     *
     * @param a 加算される最初の整数
     * @param b 加算される2番目の整数
     * @return a と b の合計値
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 2つの整数を乗算します。
     *
     * @param a 乗算される最初の整数
     * @param b 乗算される2番目の整数
     * @return a と b の積
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 2つの整数を減算します。
     *
     * @param a 減算される最初の整数
     * @param b 減算される2番目の整数
     * @return a と b の差
     */
    public int subtract(int a, int b) {
        return a - b;
    }
}