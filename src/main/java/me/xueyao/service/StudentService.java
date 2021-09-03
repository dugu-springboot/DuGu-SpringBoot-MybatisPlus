package me.xueyao.service;

import me.xueyao.base.R;
import me.xueyao.domain.Student;

/**
 * @author Simon.Xue
 * @date 2021-09-04 00:37:00
 **/
public interface StudentService {
    /**
     * 新增
     * @param student
     * @return
     */
    R insert(Student student);

    /**
     * 查询详情
     * @param id
     * @return
     */
    R<Student> getById(String id);

    /**
     * 更新
     * @param student
     * @return
     */
   R update(Student student);

    /**
     * 删除
     * @param id
     * @return
     */
   R delete(String id);
}
