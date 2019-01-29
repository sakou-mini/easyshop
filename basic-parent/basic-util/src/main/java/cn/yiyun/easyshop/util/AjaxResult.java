package cn.yiyun.easyshop.util;

public class AjaxResult {

    private boolean success;
    private String message;
    private Object resultData;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultData() {
        return resultData;
    }

    public AjaxResult setResultData(Object resultData) {
        this.resultData = resultData;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
