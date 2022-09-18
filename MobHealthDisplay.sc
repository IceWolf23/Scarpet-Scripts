__on_player_deals_damage(player, amount, entity) -> (
    
    entity_hp = format('r '+round(query(entity, 'Health')));
    _entityHealth = (number(entity_hp)-number(floor(amount)));
    if (
        _entityHealth < 0, (
            _entityHealth = 0
        )
    );
    text_string = (format('w '+entity)+format('g  » ')+format('r '+_entityHealth+' ❤'));
    display_title(player, 'actionbar', text_string);

    return()
);
