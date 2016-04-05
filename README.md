# mymusic

My Live Coding Music.

# Installation

... for a more comprehensive guide you may want to read :

* https://github.com/overtone/overtone
* https://github.com/overtone/emacs-live
* http://overtone.github.io/emacs-live/doc-clojure-connection.html

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

	emacs
	M-x cider-connect RET RET
	M-x cider-mode
	