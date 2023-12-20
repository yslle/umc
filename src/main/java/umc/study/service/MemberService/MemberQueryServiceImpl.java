package umc.study.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.domain.Member;
import umc.study.repository.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberQueryServiceImpl implements MemberQueryService {


    @Override
    public void CheckFlag(Integer flag) {

    }

    private final MemberRepository memberRepository;

    @Override
    public Optional<Member> findMember(Long id) {
        return memberRepository.findById(id);
    }
}
