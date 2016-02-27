/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crawler;

import com.mycompany.databaseOp.databaseOperation;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author aznable
 */
public class musicCrawler {
    public void callCrawler(String url) throws IOException{
        databaseOperation dO=new databaseOperation();
        StringBuffer sB=readWebPage(url);//这部分就是读取整个网页
        //接下来的任务是找出来所有歌曲的名字，然后放进数据库
        String webPage=sB.toString();
        int index=0;
        while(true){
            index=webPage.indexOf("/play/", index);
            if(index==-1) break;
            int indexTmp=webPage.indexOf("target",index);
            String urlTmp=webPage.substring(index,indexTmp);
            index=webPage.indexOf("target=_1", index);
            indexTmp=webPage.indexOf("<", index);
            String songName=webPage.substring(index+10, indexTmp);
            dO.insertion(songName, urlTmp);
        }        
    }
    private StringBuffer readWebPage(String urlContent) throws MalformedURLException, IOException{
        URL url = new URL(urlContent);
        //打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。
        Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream()),"UTF-8");
        int c;
        StringBuffer sB=new StringBuffer();
        while ((c = reader.read()) != -1) {
//            System.out.print((char) c);
            sB.append((char)c);
        }
        reader.close();
        return sB;
    }
    
}
