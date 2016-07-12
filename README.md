# Butterknife-Android
#使用
1、在project下的build.gradle里添加'android-apt'

dependencies {
    classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
  }

2、在module下的build.gradle里添加依赖

apply plugin: 'android-apt'

android {
  ...
}

dependencies {
  compile 'com.jakewharton:butterknife:8.2.1'
  apt 'com.jakewharton:butterknife-compiler:8.2.1'
}

3、在代码里使用如下：
public class MainActivity extends Activity {

    @BindView(R.id.tv_test)
    TextView mTextView;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_test)
    void onClick() {

        if (!flag) {
            flag = true;
            mTextView.setText("hello ButterKnife");
        } else {
            flag = false;
            mTextView.setText("hello world");
        }

    }
}
注意：需要在onCreate()里添加ButterKnife.bind()才能正常使用。我这是编写时最新的版本，不同的版本可能会有不同的使用方法，还有更详细的用法可以参考其源码https://github.com/JakeWharton/butterknife。
