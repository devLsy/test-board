package board.testboard.controller;

import board.testboard.domain.Criteria;
import board.testboard.domain.paging.PageMaker;
import board.testboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class BoardController {

    private final BoardService boardService;
    // 페이징 테스트
    @GetMapping("/")
    public String  list(Criteria cri, Model model) {
        model.addAttribute("list", boardService.findListWithPaging(cri));
//        model.addAttribute("list", boardService.findAllBoard());
        model.addAttribute("pageMaker", new PageMaker(boardService.findBoardCount(), cri));
        return "board/boardList";
    }
}
