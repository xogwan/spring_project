package com.codefarm.codefarmer.entity.admin;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPolicy is a Querydsl query type for Policy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPolicy extends EntityPathBase<Policy> {

    private static final long serialVersionUID = 812623324L;

    public static final QPolicy policy = new QPolicy("policy");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath policyContent = createString("policyContent");

    public final NumberPath<Long> policyId = createNumber("policyId", Long.class);

    public final StringPath policyKeyword = createString("policyKeyword");

    public final StringPath policyTitle = createString("policyTitle");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QPolicy(String variable) {
        super(Policy.class, forVariable(variable));
    }

    public QPolicy(Path<? extends Policy> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPolicy(PathMetadata metadata) {
        super(Policy.class, metadata);
    }

}

