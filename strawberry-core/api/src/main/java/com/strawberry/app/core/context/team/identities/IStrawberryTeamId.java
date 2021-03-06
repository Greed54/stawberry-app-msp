package com.strawberry.app.core.context.team.identities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.strawberry.app.common.annotation.InjectTargetAggregateIdentifier;
import com.strawberry.app.common.identity.StringIdentity;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = StrawberryTeamId.class)
@JsonDeserialize(as = StrawberryTeamId.class)
@InjectTargetAggregateIdentifier
public interface IStrawberryTeamId extends StringIdentity {

}
