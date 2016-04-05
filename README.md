# mymusic

My Live Coding Music.

# Installation

... for a more comprehensive guide you may want to read :

* https://github.com/overtone/overtone
* https://github.com/overtone/emacs-live
* http://overtone.github.io/emacs-live/doc-clojure-connection.html
* https://github.com/overtone/overtone/wiki/Installing-Overtone

This is how I do it 

    brew install emacs
    brew install leiningen

Add to .profile
	
    alias emacs="/usr/local/Cellar/emacs/24.5/bin/emacs"
	cp profiles.clj ~/.lein/profiles.clj

# Run

In one shell

	cd music
	lein live
	(use 'overtone.live)

In another shell

	emacs scratch.clj
	M-x cider-connect RET RET
	M-x cider-mode
	
	
# Cheat Sheet

| Close current window 			| C-x C-0 				|
| Run commands up to buffer 	| C-c C-c 				|
| Stop all synths 				| M-x > AND C-c C-c 	|
| Kill line                     | C-k    				|
| Undo                          | C--                   |


# Example Code

* https://github.com/overtone/overtone/wiki/Metronome-and-sequencing
	