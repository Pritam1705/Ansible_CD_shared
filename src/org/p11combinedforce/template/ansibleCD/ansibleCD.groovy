package org.p11combinedforce.ansibleCD

import org.p11combinedforce.ansibleCD.*
import org.p11combinedforce.common.*

def call(String url, String branch, String creds, String playbookName, String inventoryPath, String playbookPath) {

    // Create instances of required classes
     def gitCheckOut = new gitCheckOut()
     def wsClean=new wsClean()
     def RoleExecution= new RoleExecution()

    // Call methods with correct arguments
    wsClean.call()
    gitCheckOut.call(url, branch, creds)  
    def RoleExecution.call(inventoryPath, playbookPath)
}
