package localhost.doariva.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * simple-apiのRESTコントローラークラスです。
 * 各種APIエンドポイントを提供します。
 */
@RestController
public class HelloController {

    /**
     * Helloメッセージを返します。
     * このエンドポイントは認証を必要としません。
     *
     * @return "Hello!"という文字列
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    /**
     * 2つの整数を加算します。
     * クエリパラメータ 'a' と 'b' で整数を受け取ります。
     *
     * @param a 加算される最初の整数
     * @param b 加算される2番目の整数
     * @return a と b の合計値
     */
    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }

    /**
     * 2つの整数を乗算します。
     * クエリパラメータ 'a' と 'b' で整数を受け取ります。
     *
     * @param a 乗算される最初の整数
     * @param b 乗算される2番目の整数
     * @return a と b の積
     */
    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a * b;
    }
}
