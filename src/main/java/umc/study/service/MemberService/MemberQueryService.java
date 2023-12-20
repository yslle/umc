package umc.study.service.MemberService;

import umc.study.domain.Member;

import java.util.Optional;

public interface MemberQueryService {
    void CheckFlag(Integer flag);

    Optional<Member> findMember(Long id);
}
