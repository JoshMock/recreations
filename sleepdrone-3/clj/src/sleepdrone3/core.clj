(ns sleepdrone3.core)

(use 'overtone.live)

(definst osssc [freq 220
                vol 0.3]
  (* vol (sin-osc freq)))

(def osc1 (osssc 60))
(ctl osc1 :freq 200)
(ctl osc1 :vol 0.3)

(def osc2 (osssc 80))
(ctl osc2 :freq 70)
(ctl osc2 :vol 0.6)

(def osc3 (osssc 100))
(ctl osc3 :freq 42)
(ctl osc3 :vol 0.6)

(stop)
