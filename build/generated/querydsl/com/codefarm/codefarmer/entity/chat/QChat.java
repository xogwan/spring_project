package com.codefarm.codefarmer.entity.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChat is a Querydsl query type for Chat
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChat extends EntityPathBase<Chat> {

    private static final long serialVersionUID = 436838179L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChat chat = new QChat("chat");

    public final com.codefarm.codefarmer.entity.period.QChatPeriod _super = new com.codefarm.codefarmer.entity.period.QChatPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> chatDate = _super.chatDate;

    public final NumberPath<Long> chatId = createNumber("chatId", Long.class);

    public final StringPath chatMessage = createString("chatMessage");

    public final QChatRoom chatRoom;

    public final EnumPath<com.codefarm.codefarmer.type.ChatStatus> chatStatus = createEnum("chatStatus", com.codefarm.codefarmer.type.ChatStatus.class);

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public QChat(String variable) {
        this(Chat.class, forVariable(variable), INITS);
    }

    public QChat(Path<? extends Chat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChat(PathMetadata metadata, PathInits inits) {
        this(Chat.class, metadata, inits);
    }

    public QChat(Class<? extends Chat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new QChatRoom(forProperty("chatRoom"), inits.get("chatRoom")) : null;
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

