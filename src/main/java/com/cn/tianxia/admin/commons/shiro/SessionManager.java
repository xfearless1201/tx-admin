package com.cn.tianxia.admin.commons.shiro;

import java.io.Serializable;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.ExpiredSessionException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;

/**
 * 
 * @ClassName SessionManager
 * @Description 自定义缓存管理器
 * @author Hardy
 * @Date 2019年4月22日 下午5:31:55
 * @version 1.0.0
 */
public class SessionManager extends DefaultWebSessionManager {

    @Override
    public Cookie getSessionIdCookie() {
        // TODO Auto-generated method stub
        return super.getSessionIdCookie();
    }

    @Override
    public void setSessionIdCookie(Cookie sessionIdCookie) {
        // TODO Auto-generated method stub
        super.setSessionIdCookie(sessionIdCookie);
    }

    @Override
    public boolean isSessionIdCookieEnabled() {
        // TODO Auto-generated method stub
        return super.isSessionIdCookieEnabled();
    }

    @Override
    public void setSessionIdCookieEnabled(boolean sessionIdCookieEnabled) {
        // TODO Auto-generated method stub
        super.setSessionIdCookieEnabled(sessionIdCookieEnabled);
    }

    @Override
    public boolean isSessionIdUrlRewritingEnabled() {
        // TODO Auto-generated method stub
        return super.isSessionIdUrlRewritingEnabled();
    }

    @Override
    public void setSessionIdUrlRewritingEnabled(boolean sessionIdUrlRewritingEnabled) {
        // TODO Auto-generated method stub
        super.setSessionIdUrlRewritingEnabled(sessionIdUrlRewritingEnabled);
    }

    @Override
    protected Session createExposedSession(Session session, SessionContext context) {
        // TODO Auto-generated method stub
        return super.createExposedSession(session, context);
    }

    @Override
    protected Session createExposedSession(Session session, SessionKey key) {
        // TODO Auto-generated method stub
        return super.createExposedSession(session, key);
    }

    @Override
    protected void onStart(Session session, SessionContext context) {
        // TODO Auto-generated method stub
        super.onStart(session, context);
    }

    @Override
    public Serializable getSessionId(SessionKey key) {
        // TODO Auto-generated method stub
        return super.getSessionId(key);
    }

    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        // TODO Auto-generated method stub
        return super.getSessionId(request, response);
    }

    @Override
    protected void onExpiration(Session s, ExpiredSessionException ese, SessionKey key) {
        // TODO Auto-generated method stub
        super.onExpiration(s, ese, key);
    }

    @Override
    protected void onInvalidation(Session session, InvalidSessionException ise, SessionKey key) {
        // TODO Auto-generated method stub
        super.onInvalidation(session, ise, key);
    }

    @Override
    protected void onStop(Session session, SessionKey key) {
        // TODO Auto-generated method stub
        super.onStop(session, key);
    }

    @Override
    public boolean isServletContainerSessions() {
        // TODO Auto-generated method stub
        return super.isServletContainerSessions();
    }

    
}
