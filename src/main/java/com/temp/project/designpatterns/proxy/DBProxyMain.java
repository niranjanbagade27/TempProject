package com.temp.project.designpatterns.proxy;

interface DBQueryExecutor{
    public boolean execute(String query) throws Exception;
}

class DBQueryExecutorImpl implements DBQueryExecutor{

    @Override
    public boolean execute(String query) throws Exception {
        System.out.println("executing query");
        return true;
    }
}

class ProxyDBQueryExecutor implements DBQueryExecutor{

    private DBQueryExecutorImpl impl = new DBQueryExecutorImpl();
    private boolean isAdmin = false;

    public ProxyDBQueryExecutor(String uname, String pass){
        if(uname.equals("Admin")&&pass.equals("Admin")){
            this.isAdmin = true;
        }
    }

    @Override
    public boolean execute(String query) throws Exception {
        if(isAdmin){
            impl.execute(query);
            return true;
        }else{
            throw new Exception("Proxy not supported");
        }
    }
}

public class DBProxyMain {
    public static void main(String[] args) throws Exception {
        ProxyDBQueryExecutor p = new ProxyDBQueryExecutor("Admin", "Admin");
        System.out.println(p.execute("Query"));
        p = new ProxyDBQueryExecutor("Admin", "NonAdmin");
        System.out.println(p.execute("Query"));
    }
}
