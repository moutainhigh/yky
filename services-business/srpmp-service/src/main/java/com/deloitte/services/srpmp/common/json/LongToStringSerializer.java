package com.deloitte.services.srpmp.common.json;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by lixin on 30/04/2019.
 */
public class LongToStringSerializer implements ObjectSerializer {

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {
        Long value = (Long) object;
        serializer.write(String.valueOf(value));
    }

}
