package com.tccbanking.internetbakingspring.tenant;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;

public class TenantInterceptor{

    private static final ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public static String getCurrentTenent(){
        return currentTenant.get();
    }

    public static void setCurrentTenent(String tenant){
        currentTenant.set(tenant);

    }

    public static void clear(){
        currentTenant.remove();
    }

    public class MultTenantFilter implements Filter(){
        
    }

  

    }
    

