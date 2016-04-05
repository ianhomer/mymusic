(def kick (sample (freesound-path 2086)))
(definst c-hat [amp 0.8 t 0.04]
  (let [env (env-gen (perc 0.001 t) 1 1 0 1 FREE)
        noise (white-noise)
        sqr (* (env-gen (perc 0.01 0.04)) (pulse 880 0.2))
        filt (bpf (+ sqr noise) 9000 0.5)]
    (* amp env filt)))


(def metro (metronome 120))
(metro)
(metro 100)

(defn player [beat]
  (at (metro beat) (kick))
  (at (metro beat) (c-hat))
  (at (metro (+ 0.25 beat)) (piano 72))
  (at (metro (+ 0.25 beat)) (c-hat))
  (apply-by (metro (inc beat)) #'player (inc beat) []))

(player (metro))

(metro-bpm metro 120)

(piano)
(piano 72)

(defn play-chord [my-chord]
  (doseq [note my-chord] (piano note)))

(play-chord (chord :C3 :minor))
(play-chord (chord :C3 :major))

(at (+ 1000 (now) ) (play-chord (chord :C3 :minor)))

(let [time (now)]
  (at time (play-chord (chord :D3 :major7))))

(definst beep [note 60]
  (let [src (sin-osc (midicps note))
        env (env-gen (perc 0.05 1.0))]
    (* src env)))

(beep)

(stop)
