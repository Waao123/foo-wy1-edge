package com.bore.foo.bore.VO;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("foo_wy")
public class ResultVO {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
