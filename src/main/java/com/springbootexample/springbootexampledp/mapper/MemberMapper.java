package com.springbootexample.springbootexampledp.mapper;

import com.springbootexample.springbootexampledp.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository //해당 클래스를 루트 컨테이너에 bean 객체로 생성, DB나 파일같은 외부 I/O 작업 처리
@Mapper //매핑파일에 기재된 SQL을 호출하기 위한 인터페이스
public interface MemberMapper {
    void memberSave(Member member);
}
