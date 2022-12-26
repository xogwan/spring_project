package com.codefarm.codefarmer.entity.mentor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = 453960346L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final QMentorBoard mentorBoard;

    public final StringPath reviewContent = createString("reviewContent");

    public final NumberPath<Long> reviewId = createNumber("reviewId", Long.class);

    public final NumberPath<Integer> reviewStar = createNumber("reviewStar", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
        this.mentorBoard = inits.isInitialized("mentorBoard") ? new QMentorBoard(forProperty("mentorBoard"), inits.get("mentorBoard")) : null;
    }

}

