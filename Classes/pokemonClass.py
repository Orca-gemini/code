class Pokemon:
    type : str = "water"
    def __init__(this, name,health, att, defense):
        this.name = name
        this.health = health
        this.att = att
        this.defense = defense
        
        if(att >= 100):
            this.dead();
        else:
            this.__defense
        
    def __attack(this, att_name, charged_attack):
        print("Attack name for pokemon: ", att_name)
        print("Charged Attack obj: ", charged_attack)
        
    def __defense(this, def_name, armour):
        print("Pokemon's def name: " + def_name)
        print("Armour remaining: ", armour)
        
    def __dead(this):
        print("Dead poke")
        
squittle = Pokemon()
Horsesea = Pokemon()
