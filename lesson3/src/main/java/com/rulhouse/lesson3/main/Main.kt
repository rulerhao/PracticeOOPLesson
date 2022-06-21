package com.rulhouse.lesson3.main

import com.rulhouse.lesson3.main.engine.Engine
import com.rulhouse.lesson3.main.engine.SteamEngine
import com.rulhouse.lesson3.main.engineer.Engineer
import com.rulhouse.lesson3.main.engineer.SteamEngineEngineer

class Main {
    val engine = Engine(Engineer())
    val engineMadeBySteamEngineEngineer = Engine(SteamEngineEngineer())
//    val steamEngine = SteamEngine(Engineer())  // It could be not runnable.
    val steamEngineMadeBySteamEngineEngineer = SteamEngine(SteamEngineEngineer())
}