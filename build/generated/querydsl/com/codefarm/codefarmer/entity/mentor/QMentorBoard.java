package com.codefarm.codefarmer.entity.mentor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMentorBoard is a Querydsl query type for MentorBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMentorBoard extends EntityPathBase<MentorBoard> {

    private static final long serialVersionUID = 1142340003L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMentorBoard mentorBoard = new QMentorBoard("mentorBoard");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final QMentor mentor;

    public final NumberPath<Long> mentorBoardId = createNumber("mentorBoardId", Long.class);

    public final StringPath mentorCareer = createString("mentorCareer");

    public final StringPath mentorExCareer = createString("mentorExCareer");

    public final ListPath<MentorFile, QMentorFile> mentorFiles = this.<MentorFile, QMentorFile>createList("mentorFiles", MentorFile.class, QMentorFile.class, PathInits.DIRECT2);

    public final StringPath mentorStrongContent1 = createString("mentorStrongContent1");

    public final StringPath mentorStrongContent2 = createString("mentorStrongContent2");

    public final StringPath mentorStrongContent3 = createString("mentorStrongContent3");

    public final StringPath mentorStrongTitle1 = createString("mentorStrongTitle1");

    public final StringPath mentorStrongTitle2 = createString("mentorStrongTitle2");

    public final StringPath mentorStrongTitle3 = createString("mentorStrongTitle3");

    public final StringPath mentorTextContent = createString("mentorTextContent");

    public final StringPath mentorTextTitle = createString("mentorTextTitle");

    public final StringPath mentorTitle = createString("mentorTitle");

    public final StringPath mentorTitleSub = createString("mentorTitleSub");

    public final ListPath<Review, QReview> reviews = this.<Review, QReview>createList("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMentorBoard(String variable) {
        this(MentorBoard.class, forVariable(variable), INITS);
    }

    public QMentorBoard(Path<? extends MentorBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMentorBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMentorBoard(PathMetadata metadata, PathInits inits) {
        this(MentorBoard.class, metadata, inits);
    }

    public QMentorBoard(Class<? extends MentorBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
        this.mentor = inits.isInitialized("mentor") ? new QMentor(forProperty("mentor"), inits.get("mentor")) : null;
    }

}

