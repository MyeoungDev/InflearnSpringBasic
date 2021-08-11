package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan( // Component SpringBean을 자동으로 끌어올려서 등록해주는 애노테이션

//        basePackages = "hello.core.member",
        //  hello.core.member -> member package부터 component를 찾아 등록하는 것
        // 만약 등록하지 않으면 default 값으로 AutoAppConfig같은 메인 설정정보의 모든 프로젝트를 다 뒤져서
        // 모든 Component를 설정해준다.

        // 즉, 내 프로젝트 최상위에 default값으로 그냥 설정하는게 가장 권장되고 편하다.

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        // Component Scan을통해 Spring Bean을 다 등록하는데 그중에
        // 제외시킬것들을 등록 해주는 것
)
public class AutoAppConfig {

}
