#### 각종 어노테이션 및 인터페이스3

- @EnableOAuth2Client : @EnableOAuth2Client를 사용하여 OAuth2 클라이언트를 수동으로 구성할 수 있다.
(@EnableOAuth2Sso라는 어노테이션은 자동으로 하나의 소셜 로그인 설정을 지원하지만, 여러 개의 필터를 이용해 소셜 로그인을 붙일 경우 위 어노테이션을 사용)
#
- OAuth2ClientContext : session scope에 위치하여 다른 user들을 분리된 상태로 유지시킵니다. 서버에서 동등한 데이터 구조를 관리해야 할 필요 없이 user에게 요청되도록 매핑하고, 각 user가 분리된 OAuth2ClientContext 객체와 연결되도록 한다.
#
- BasicAuthenticationFilter : HTTP 기본 인증 헤더를 감시하고 이를 처리함
#
- FilterRegistrationBean : Filter를 스프링 부트에 적용시키는 방법 중 하나
#
- Filter : 요청에 대한 전후 처리라고 하는 역할을 수행, Filter는 Servlet에서 처리하기 전후 실행하고 Web Application에 등록
#
- CompositeFilter : 복합 Servlet Filter
#
- OAuth2ClientAuthenticationProcessingFilter 필터 : 인증 서버에서 OAuth2 액세스 토큰을 획득하고 인증 객체를 SecurityContext에 로드하는 데 사용할 수 있는 OAuth2 클라이언트 필터 (OAuth 2.0 리소스 서버 구현에서 필수로 요구받는 필터)
#
- OAuth2RestTemplate : Rest 기반의 서비스를 위해 사용한다.
#
- UserInfoTokenServices : User 정보를 얻어오기 위해 소셜 서버와 통신하는 역할
