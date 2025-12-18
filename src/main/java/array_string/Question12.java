package array_string;

import java.util.*;

/**
 * 【380.O(1)时间插入，删除和获取随机元素】
 *
 * 实现RandomizedSet 类：
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 *
 * @Author: haoanxu
 * @Date: 2025/12/17
 */
public class Question12 {

    private ArrayList<Integer> list;
    private Map<Integer,Integer> map;
    private Random random;

    public Question12() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else {
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else {
            int deleteIndex = map.get(val);
            int lastVal = list.get(list.size()-1);
            //覆盖(删除)要删除的值
            list.set(deleteIndex,lastVal);
            map.put(lastVal,deleteIndex);
            //删除List最后一个元素就行了
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
