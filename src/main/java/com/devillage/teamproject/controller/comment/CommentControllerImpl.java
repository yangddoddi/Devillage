package com.devillage.teamproject.controller.comment;

import com.devillage.teamproject.dto.CommentDto;
import com.devillage.teamproject.service.comment.CommentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentControllerImpl implements CommentController{
    private final CommentService commentService;

    public CommentControllerImpl(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public CommentDto.Response postComment(CommentDto.Post request, Long postId, String token) {
        return CommentDto.Response.of(commentService.createComment(request.toEntity(postId), token));
    }

    @Override
    public Long postReComment(Long postId, Long commentId, CommentDto.ReCommentPost request) {
        return null;
    }

    @Override
    public Long postLike(Long postId, Long commentId) {
        return null;
    }

    @Override
    public CommentDto.Response getComment(Long postId, Long commentId, Long page, Long size) {

        return null;
    }

    @Override
    public CommentDto.ReCommentResponse getReComment(Long postId, Long commentId, Long reCommentId, Long page, Long size) {
        return null;
    }

    @Override
    public Long patchComment(Long postId, Long commentId, CommentDto.Patch request) {
        return null;
    }

    @Override
    public Long patchReComment(Long postId, Long commentId, Long reCommentId, CommentDto.ReCommentPatch request) {
        return null;
    }

    @Override
    public void deleteComment(Long postId, Long id) {

    }

    @Override
    public void deleteReComment(Long postId, Long commentId, Long reCommentID) {

    }
}
