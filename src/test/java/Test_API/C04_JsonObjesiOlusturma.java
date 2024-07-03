package Test_API;

import org.json.JSONObject;
import org.junit.Test;

public class C04_JsonObjesiOlusturma {

    @Test
    public void test02(){
        /*
            {
            "title":"Ahmet",
            "body":"Merhaba",
            "userId":1
            }
         */

        JSONObject object = new JSONObject();
        object.put("title","Ahmet");
        object.put("body","Merhaba");
        object.put("userId",1);

        System.out.println(object);

        //{"title":"Ahmet","body":"Merhaba","userId":1}





    }
}
