package org.apache.ibatis.cache;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * CurrentHashMapTest
 *
 * @auther wubo25320
 * @create 2020-10-14 20:23
 */
public class ConcurrentHashMapTest {

  @Test
  public void putIfAbsent() {
    ConcurrentHashMap map = new ConcurrentHashMap();
    Object ifAbsent = map.putIfAbsent("abc", "abc");
    System.out.println(ifAbsent);

    System.out.println("-------");

    Object ifAbsent1 = map.putIfAbsent("abc", "abc1");

    System.out.println(ifAbsent1);

    Object abc = map.get("abc");
    System.out.println(abc);

    // put与putIfAbsent区别:
    //
    //put在放入数据时，如果放入数据的key已经存在与Map中，最后放入的数据会覆盖之前存在的数据，
    //
    //而putIfAbsent在放入数据时，如果存在重复的key，那么putIfAbsent不会放入值。
    //
    //
    //
    //putIfAbsent   如果传入key对应的value已经存在，就返回存在的value，不进行替换。如果不存在，就添加key和value，返回null
  }
}
