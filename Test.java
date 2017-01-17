import rx.Observable;
import rx.Observer;
import rx.Subscriber;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangjinzhao on 2017/1/17.
 */
public class Test {
    public static void main(String... args)
    {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            public void call(final Subscriber<? super Integer> subscriber) {
                Arrays.asList(1,2,3,4,5,6).forEach(subscriber::onNext);
            }
        }).subscribe(new Subscriber<Integer>() {
            public void onCompleted() {
                System.out.println("finish");
            }

            public void onError(Throwable throwable) {

            }

            public void onNext(Integer s) {
                System.out.println(s);
            }
        });
    }
}
