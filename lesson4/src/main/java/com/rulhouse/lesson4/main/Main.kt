package com.rulhouse.lesson4.main

import com.rulhouse.lesson4.main.engine.Engine
import com.rulhouse.lesson4.main.engine.SteamEngine
import com.rulhouse.lesson4.main.engineer.ComputerScienceEngineer
import com.rulhouse.lesson4.main.engineer.ComputerScienceSteamEngineer
import com.rulhouse.lesson4.main.engineer.Engineer
import com.rulhouse.lesson4.main.engineer.SteamEngineEngineer

class Main {
//    val engine = Engine(Engineer())   // It could be not runnable.
//    val engineMadeBySteamEngineEngineer = Engine(SteamEngineEngineer())   // It could be not runnable.
//    val steamEngine = SteamEngine(Engineer())  // It could be not runnable.
//    val steamEngineMadeBySteamEngineEngineer = SteamEngine(SteamEngineEngineer())   // It could be not runnable.
    val computerScienceEngine = Engine(ComputerScienceEngineer())
    val computerScienceEngineMadeBySteamEngineer = Engine(ComputerScienceSteamEngineer())
    val computerScienceSteamEngine = SteamEngine(ComputerScienceEngineer())
    val computerScienceSteamEngineMadeBySteamEngineer = SteamEngine(ComputerScienceSteamEngineer())
}