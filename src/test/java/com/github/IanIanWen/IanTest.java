package com.github.IanIanWen;

import junit.framework.Assert;
import org.junit.Test;

public class IanTest {
    @Test
    public void getType() throws Exception {
        Ian tri =new Ian(5,5,10);
        String result = tri.getType();
        Assert.assertEquals("不是三角形",result);
    }

}
