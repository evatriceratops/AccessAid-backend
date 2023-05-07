package dev.accessaid.AccessAid.Comments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.accessaid.AccessAid.Comments.model.Comment;
import dev.accessaid.AccessAid.Places.model.Place;
import dev.accessaid.AccessAid.User.model.User;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findAllCommentsByPlace(Place place);

    List<Comment> findAllCommentsByUser(User user);

}
