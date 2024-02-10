class os:
    def __init__(this, version):
        if version <  2.0:
            this.__updateSoftware()
            this.version = version + 1
        else:
            this.version = version
    
    ## can call the update method when inside the class 
 
    def boot(this):
        print("Booting up")
    
    # private function !! 
    def __updateSoftware(this):
        print("Updating software")
        
os1 = os(1)
os1.boot()
