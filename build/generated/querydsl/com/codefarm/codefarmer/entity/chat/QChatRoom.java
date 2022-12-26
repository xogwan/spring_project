package com.codefarm.codefarmer.entity.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatRoom is a Querydsl query type for ChatRoom
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatRoom extends EntityPathBase<ChatRoom> {

    private static final long serialVersionUID = -1338619234L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatRoom chatRoom = new QChatRoom("chatRoom");

    public final com.codefarm.codefarmer.entity.period.QChatPeriod _super = new com.codefarm.codefarmer.entity.period.QChatPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> chatDate = _super.chatDate;

    public final NumberPath<Long> chatRoomId = createNumber("chatRoomId", Long.class);

    public final com.codefarm.codefarmer.entity.member.QMember mentee;

    public final com.codefarm.codefarmer.entity.member.QMember mentor;

    public QChatRoom(String variable) {
        this(ChatRoom.class, forVariable(variable), INITS);
    }

    public QChatRoom(Path<? extends ChatRoom> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatRoom(PathMetadata metadata, PathInits inits) {
        this(ChatRoom.class, metadata, inits);
    }

    public QChatRoom(Class<? extends ChatRoom> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mentee = inits.isInitialized("mentee") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("mentee")) : null;
        this.mentor = inits.isInitialized("mentor") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("mentor")) : null;
    }

}

