package com.tom.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LoggingAspect
 * Description: 日志切面
 *
 * @author Mi_dad
 * @date 2019/10/6 14:11
 */
@Component  //标识为一个组件
@Aspect     //标识为一个切面
@Order(1)   //切面优先级，默认值为最大值2147483647
public class LoggingAspect {

    @Pointcut("execution(* com.tom.spring.annotation.CalculatorImpl.*(..))")
    public void declarePointCut(){

    }

//    @Before("execution(* com.tom.spring.annotation.CalculatorImpl.*(..))")
    @Before("declarePointCut()")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("The method "+joinPoint.getSignature().getName()+" before ===>"+ Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* com.tom.spring.annotation.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        System.out.println("The method "+joinPoint.getSignature().getName()+" after ===>");
    }

    @AfterReturning(value = "execution(* com.tom.spring.annotation.CalculatorImpl.*(..))",returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint,Object result){
        System.out.println("The method "+joinPoint.getSignature().getName()+" result ===> "+result);
    }

    @AfterThrowing(value = "execution(* com.tom.spring.annotation.CalculatorImpl.*(..))",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        System.out.println("The method "+joinPoint.getSignature().getName()+" throw a exception ===> "+ex);
    }

    /*@Around(value = "execution(* com.tom.spring.annotation.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjp){
        //获取方法名称
        String methodName = pjp.getSignature().getName();
        //获取参数
        Object[] args = pjp.getArgs();
        try {
            //前置通知
            System.out.println("方法:"+methodName+" 参数:"+Arrays.toString(args));
            //执行目标方法
            Object result = pjp.proceed();
            //返回通知
            System.out.println("结果:"+result);
            //返回结果
            return result;
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("出现异常:"+throwable);
            throwable.printStackTrace();
        }finally {
            //后置通知
            System.out.println("方法调用结束");
        }
        return null;
    }*/
}
