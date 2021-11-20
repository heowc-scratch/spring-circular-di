### log

```text
2021-11-20 16:55:34.502  INFO 35676 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2021-11-20 16:55:34.516 ERROR 35676 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The dependencies of some of the beans in the application context form a cycle:

┌─────┐
|  serviceA defined in file [.../spring-circler-di/build/classes/java/main/com/example/ServiceA.class]
↑     ↓
|  serviceB defined in file [.../spring-circler-di/build/classes/java/main/com/example/ServiceB.class]
↑     ↓
|  serviceC defined in file [.../spring-circler-di/build/classes/java/main/com/example/ServiceC.class]
└─────┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.


Process finished with exit code 1
```

See https://github.com/spring-projects/spring-framework/issues/25443